package org._3_loopsmethodsclasses.excel;


//You are given an Excel file Incomes-Report.xlsx holding an incomes report
//Each office puts in this Excel file all their incomes (office, date, description, income, 20% VAT, total income).
// Your task is to read the report and to calculate the incomes sub-totals for each office (with VAT).
// Order the offices alphabetically. Print the result at the console in format town Total -> incomes.
// Finally calculate and print the grand total (the sum of all incomes in all offices).

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class _10_ExcelReader {

    public static void main(String[] args) {
        String inputFile = "src/org/_3_loopsmethodsclasses/Incomes-Report.xlsx";
        //setting the local date
        Locale.setDefault(Locale.ROOT);

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        List<Office> offices = new ArrayList<Office>();

        try (FileInputStream fileInputStream = new FileInputStream(inputFile)) {
            Workbook wb = new XSSFWorkbook(fileInputStream);
            Sheet sheet = wb.getSheetAt(0);
            for (Row row : sheet) {
                if (row.getRowNum() == 0) {
                    continue;
                }

                String officeName = row.getCell(0).toString();
                LocalDate date = LocalDate.parse(row.getCell(1).toString(), dateFormat);
                String description = row.getCell(2).toString();
                double income = Double.parseDouble(row.getCell(3).toString());

                //checks if the office name exists in offices, if it doesn't exist, create new office
                //if it exists, add the income to the income of the existing office
                Office office = offices.stream()
                        .filter(o -> o.getOfficeName().equals(officeName))
                        .findFirst()
                        .orElse(null);

                if (office == null) {
                    office = new Office(officeName, date, description, income);
                } else {
                    office.setIncome(office.getIncome() + income);
                }
            }

            //sort by the method in the class that implements Comparable
            Collections.sort(offices);
            //sum the total income of all office
            double total = offices.stream().filter(o -> o.getTotalIncome()>0).mapToDouble(o -> o.getTotalIncome()).sum();

            System.out.println(String.join("\n",offices.stream().map(o -> o.toString()).collect(Collectors.toList())));
            System.out.println(String.format("Grand Total -> %.2f", total));


        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}




