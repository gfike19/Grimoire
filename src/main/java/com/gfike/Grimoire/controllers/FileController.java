package com.gfike.Grimoire.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class FileController {
//    @PostMapping("/import")
//    public void mapReapExcelDatatoDB(@RequestParam("file") MultipartFile reapExcelDataFile) throws IOException {
//
//        List<Test> tempStudentList = new ArrayList<Test>();
//        XSSFWorkbook workbook = new XSSFWorkbook(reapExcelDataFile.getInputStream());
//        XSSFSheet worksheet = workbook.getSheetAt(0);
//
//        for(int i=1;i<worksheet.getPhysicalNumberOfRows() ;i++) {
//            Test tempStudent = new Test();
//
//            XSSFRow row = worksheet.getRow(i);
//
//            tempStudent.setId((int) row.getCell(0).getNumericCellValue());
//            tempStudent.setContent(row.getCell(1).getStringCellValue());
//            tempStudentList.add(tempStudent);
        }

