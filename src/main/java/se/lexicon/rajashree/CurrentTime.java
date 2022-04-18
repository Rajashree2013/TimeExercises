package se.lexicon.rajashree;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class CurrentTime {

    public static void main(String[] args) {



        //Exercise 1:
        //Create a LocalDate of the current day and print it out

        LocalDate now = LocalDate.now();
        System.out.println("Exercise 1: Current Date : "+now);
//=====================================================================================================================
        //Exercise2:
        //Create a LocalDate of the current day and print it out in the following pattern using
        //DateTimeFormatter: Torsdag 29 mars.

        DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        String date = dtf.format(now);
        System.out.println("Exercise 2:"+ date); //måndag 18 april 2022
//=====================================================================================================================
       // Exercise3:
        // Create a LocalDate of last Monday. Then print out the entire week in a loop using standard ISO
        //format


//======================================================================================================================


      //  Exercise 4:
      //  Create a LocalDate object from a String by using the .parse() method.

         String date1 = "2016-08-16";
         LocalDate localDate = LocalDate.parse(date1);
         System.out.println( "Exercise 4:"+ localDate);

//=====================================================================================================================
        //Exercise5
        //The date time api provides enums for time units such as day and month. Create a LocalDate of 1945-
            //    05-08 and extract the day of week for that date.






//=====================================================================================================================

       // Exercise6
      //  Create a LocalDate of current date plus 10 years and minus 10 months. From that date extract the
        //month and print it out.

        LocalDate today6 =  LocalDate.now();             //Today
        LocalDate sameDayAfter10Year = today6.plusYears(10);
        LocalDate sameDayAfter10YearMinus10Month = sameDayAfter10Year.minusMonths(10);
        System.out.println("Exercise6 Month: "+sameDayAfter10YearMinus10Month.getMonth());



//======================================================================================================================
       //Exercise7
        //Using the LocalDate from exercise 6 and your birthdate, create a Period between your birthdate and
       // the date from exercise 5. Print out the elapsed years, months and days.




//======================================================================================================================
        //Exercise 8
        //Create a period of 4 years, 7 months and 29 days. Then create a LocalDate of current date and add
        //the period you created to the current date.




//======================================================================================================================

       // Exercise 9
        //Create a LocalTime object of the current time

        LocalTime now1= LocalTime.now();
        System.out.println("Exercise 9: Current time : "+now1);
//=========================================================================================================================

        //Exercise 10
        //Extract the nanoseconds of a LocalTime object of current time. Print out the nanoseconds





//====================================================================================================================


       // Exercise 11
        //Create a LocalTime object from a String using the .parse() method.

        String time1 = "10:41";

        LocalTime localtime = LocalTime.parse(time1);

        System.out.println(  "Exercise 11:" +  localtime);




//================================================================================================================



        //Exercise 12
       // Using DateTimeFormatter format LocalTime from current time and print it out as following pattern:
      //  10:32:53
        // create a LocalTime Objects
        LocalTime time = LocalTime.parse("03:18:23");
        // create formatter Object
        DateTimeFormatter formatter = DateTimeFormatter.ISO_TIME;
        // apply format
        String value = time.format(formatter);
        // print result
        System.out.println("Exercise 12 value : " + value);

//=====================================================================================================================
        //Exercise 13
       //Create a LocalDateTime with the date and time components as: date: 2018-04-05, time: 10.00.
        //Current Date and Time

        LocalDate currentDay=  LocalDate.now();
        LocalTime CurrentTime= LocalTime.now();
        System.out.println("Exercise 13 date :"+currentDay+", time :"+CurrentTime);

//======================================================================================================================
        //Exercise 14
        //Using DateTimeFormatter format the LocalDateTime object from exercise 11 to a String that should
        //ook tile this: torsdag 5 april 10:00





//====================================================================================================================

       // Exercise 15
        //Create a LocalDateTime object by combining LocalDate object and LocalTime object.




//=====================================================================================================================


        // Exercise 16
      // Create a LocalDateTime object. Then get the LocalDate and LocalTime components into separate
        // objects of respective types from the LocalDateTime object.



//=====================================================================================================================


       // Extra assignment
       // Create your own calendar for the year 2018




//=====================================================================================================================



        LocalDate today =  LocalDate.now();             //Today
        LocalDate tomorrow = today.plusDays(7);     //Plus 1 day
        LocalDate yesterday = today.minusDays(1);   //Minus 1 day

        System.out.println(today);
        System.out.println(tomorrow);
        System.out.println(yesterday);
//======================================================================================================================
// Add and substract 1 month from LocalDateTime

        LocalDateTime now3 =  LocalDateTime.now();     //Current Date and Time
        LocalDateTime sameDayNextMonth = now3.plusMonths(1);       //2018-08-14
        LocalDateTime sameDayLastMonth = now3.minusMonths(1);      //2018-06-14

        System.out.println(now3);
        System.out.println(sameDayNextMonth);
        System.out.println(sameDayLastMonth);

 //Add and substract 1 year from LocalDateTime

        LocalDateTime sameDayNextYear = now3.plusYears(1);     //2019-07-14
        LocalDateTime sameDayLastYear = now3.minusYears(1);    //2017-07-14

        System.out.println(sameDayNextYear);
        System.out.println(sameDayLastYear);




    }
}






