package day10_NestedIf;

public class NameOfMonth2 {
    public static void main(String[] args) {
        int month= 1;
        String Calender = (month==1)? "January"
                :(month==2)? "February"
                :(month==3)? "March"
                :(month==4)? "April"
                :(month==5)? "May"
                :(month==6)? "June"
                :(month==7)? "July"
                :(month==8)? "August"
                :(month==9)? "September"
                :(month==10)? "October"
                :(month==11)? "November" : "December";
        System.out.println(Calender);





    }
}
