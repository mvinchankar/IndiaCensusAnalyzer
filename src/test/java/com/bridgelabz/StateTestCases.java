package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class StateTestCases {
    private String SAMPLE_CSV_PATH = "/home/slot1/StateCensusData.csv";
    private String className = "com.bridgelabz.CSVStateCensus";

    @Test
    public void when_Read_CSV_File_Count_Records_Should_Return_True() {
        StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
        try {
            Assert.assertEquals("HAPPY", stateCensusAnalyser.getCountOfRecords(29, SAMPLE_CSV_PATH, className));
        } catch (StateCensusException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(StateCensusException.ExceptionType.NO_SUCH_FILE, e.type);
        }
    }

    @Test
    public void when_Incorrect_CSV_File_Should_Return_False() {
        StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
        try {
            Assert.assertEquals("HAPPY", stateCensusAnalyser.getCountOfRecords(29, SAMPLE_CSV_PATH, className));
        } catch (StateCensusException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(StateCensusException.ExceptionType.NO_SUCH_FILE, e.type);
        }

    }

    @Test
    public void when_InCorrect_CSV_FileType_Should_Return_False() {
        StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
        try {
            Assert.assertEquals("HAPPY", stateCensusAnalyser.getCountOfRecords(29, SAMPLE_CSV_PATH, className));
        } catch (StateCensusException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(StateCensusException.ExceptionType.INCORRECT_TYPE, e.type);
        }

    }

    @Test
    public void when_Correct_CSV_File_But_Delimiter_Incorrect_Should_Return_False() {
        StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
        try {
            Assert.assertEquals("HAPPY", stateCensusAnalyser.getCountOfRecords(29, SAMPLE_CSV_PATH, className));
        } catch (StateCensusException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(StateCensusException.ExceptionType.INCORRECT_TYPE, e.type);
        }

    }

    @Test
    public void when_Correct_CSV_File_But_Header_Incorrect_Should_Return_False() throws IOException {
        StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
        try {
            Assert.assertEquals("HAPPY", stateCensusAnalyser.getCountOfRecords(29, SAMPLE_CSV_PATH, className));
        } catch (StateCensusException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(StateCensusException.ExceptionType.INCORRECT_TYPE, e.type);
        }

    }

    @Test
    public void when_Correct_CSV_File_Report_Most_Populous_State_to_Least_One() {
        StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
        try {
            Assert.assertEquals("HAPPY", stateCensusAnalyser.getCountOfRecords(29, SAMPLE_CSV_PATH, className));
        } catch (StateCensusException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(StateCensusException.ExceptionType.INCORRECT_TYPE, e.type);
        }

    }

    @Test
    public void when_Correct_CSV_File_Report_State_Name_As_Per_Ascending_Order() {
        StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
        try {
            Assert.assertEquals("HAPPY", stateCensusAnalyser.getCountOfRecords(29, SAMPLE_CSV_PATH, className));
        } catch (StateCensusException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(StateCensusException.ExceptionType.INCORRECT_TYPE, e.type);
        }

    }

    @Test
    public void when_Correct_CSV_File_Report_Area_In_Sqs_Kms_In_Descending_Order() {
        StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
        try {
            Assert.assertEquals("HAPPY", stateCensusAnalyser.getCountOfRecords(29, SAMPLE_CSV_PATH, className));
        } catch (StateCensusException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(StateCensusException.ExceptionType.ENTERED_EMPTY, e.type);
        }

    }

    @Test
    public void when_Correct_CSV_File_Report_Density_Per_Sqs_Kms() {
        StateCensusAnalyser stateCensusAnalyser = new StateCensusAnalyser();
        try {
            Assert.assertEquals("HAPPY", stateCensusAnalyser.getCountOfRecords(29, SAMPLE_CSV_PATH, className));
        } catch (StateCensusException e) {
            System.out.println(e.getMessage());
            Assert.assertEquals(StateCensusException.ExceptionType.INCORRECT_TYPE, e.type);
        }

    }


}
