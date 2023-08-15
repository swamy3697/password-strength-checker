package com.company;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Checker {
    private int points=0;
    private final int LOWER_CASE_POINTS=50;
    private final int UPPER_CASE_POINTS=50;
    private final int SPECIAL_CHARACTER_POINTS=50;
    private final int NUMBERS_POINTS=50;
    private final int MINIMUM_LENGTH_POINTS=100;
    private boolean isLowerCaseNotDone;
    private boolean isUpperCaseNotDone;
    private boolean isSymbolsNotDone;
    private boolean isNumbersNotDone;

    private final String LOWER_CASE_REGEX="[a-z]";
    private final String UPPER_CASE_REGEX="[A-Z]";
    private final String SPECIAL_CHARACTER_REGEX="[!\\\"#$%&'()*+,-./:;<=>?@[\\\\\\\\]^_`{|}~]";
    private final String NUMBERS_REGEX="[0-9]";
    Pattern lowerCasePattern =Pattern.compile(LOWER_CASE_REGEX);
    Pattern upperCasePattern=Pattern.compile(UPPER_CASE_REGEX);
    Pattern specialCharatcerPattern=Pattern.compile(SPECIAL_CHARACTER_REGEX);
    Pattern numberPattern=Pattern.compile(NUMBERS_REGEX);

    public void check(String password)
    {
        setValues();

       points=0;

            if(password.length()>=8)
            {

                points=MINIMUM_LENGTH_POINTS;
            }

        for (int i=0;i<password.length();i++) {
            givePoints(password.charAt(i));

        }

        if(points<=70)
        {

            System.out.println("Very Very Weak");

        }
        else if (points>=70 && points<150)
        {

            System.out.println("Very Weak");
        }
        else if (points>=150 && points<200)
        {

            System.out.println(" Weak");
        }
        else if (points>=200 && points<250)
        {

            System.out.println(" medium");
        }
        else if (points>=250 && points<300)
        {
            System.out.println(" Strong");
        }
        else if (points>=300)
        {
            System.out.println("Very Strong");
        }
        else
        {
            System.out.println("something went wrong debug the code");
        }



    }

    private void setValues() {
        isNumbersNotDone=true;
        isSymbolsNotDone=true;
        isUpperCaseNotDone=true;
        isLowerCaseNotDone=true;
        
    }

    //thank you


    private void givePoints(char chr) {
        char character=chr;
        Matcher  lowerCaseMatcher=lowerCasePattern.matcher(String.valueOf(character));
        Matcher  upperCaseMatcher=upperCasePattern.matcher(String.valueOf(character));
        Matcher  specialCharatcerMatcher=specialCharatcerPattern.matcher(String.valueOf(character));
        Matcher  numberMatcher=numberPattern.matcher(String.valueOf(character));
        if (character==' ')
        {
            points=points+10;
            return;
        }
        if (lowerCaseMatcher.matches() && isLowerCaseNotDone)
        {
            //  System.out.println("in lower");
            points=points+LOWER_CASE_POINTS;
            isLowerCaseNotDone=false;
            return;
            // System.out.println("Character is :" +character +"And Points is  :"+this.points);
        }

        if(upperCaseMatcher.matches()&& isUpperCaseNotDone)
        {
            // System.out.println("in upper");
            points=points+UPPER_CASE_POINTS;
            isUpperCaseNotDone=false;
            return;
            //  System.out.println("Character is :" +character +"And Points is  :"+this.points);
        }
        if(specialCharatcerMatcher.matches() && isSymbolsNotDone)
        {
            // System.out.println("in specail");
            points=points+SPECIAL_CHARACTER_POINTS;
            isSymbolsNotDone=false;
            return;
            //System.out.println("Character is :" +character +"And Points is  :"+points);
        }
        if(numberMatcher.matches() && isNumbersNotDone)
        {
           // System.out.println("in number");
            points=points+NUMBERS_POINTS;
            isNumbersNotDone=false;
            return;
            //System.out.println("Character is :" +character +"And Points is  :"+points);
        }

    }

// very week 50

}
