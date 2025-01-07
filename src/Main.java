public class Main {
    public static void main(String[] args) {

        // Task 1

        var dog = 8.0;
        System.out.println("dog - " + dog);
        var cat = 3.6;
        System.out.println("cat - " + cat);
        var paper = 763789;
        System.out.println("paper - " + paper);

        //Task 2
        dog = dog +4;
        System.out.println("1 updated meaning 'dog' - " + dog);
        cat = cat +4;
        System.out.println("1 updated meaning 'cat' - " + cat);
        paper = paper +4;
        System.out.println("1 updated meaning 'paper' - " + paper);

        //Task 3
        dog = dog - 3.5;
        System.out.println("2 updated meaning 'dog' - " + dog);
        cat = cat - 1.6;
        System.out.println("2 updated meaning 'cat' - " + cat);
        paper = paper - 7639;
        System.out.println("2 updated meaninng 'paper' - " + paper);

        //Task 4

        var friend = 19;
        System.out.println("friend - " + friend);
        friend = friend + 2;
        System.out.println("1 updated meaning 'friend' - " + friend);
        friend = friend / 7;
        System.out.println("2 updated meaning 'friend' - " + friend);

        //Task 5

        var frog = 3.5;
        System.out.println("frog - " + frog);
        frog = frog * 10;
        System.out.println("1 updated meaning 'frog' - " + frog);
        frog = frog / 3.5;
        System.out.println("2 updated meaning 'frog' - " + frog);
        frog = frog + 4;
        System.out.println("3 updated meaning 'frog' - " + frog);

        //Task 6

        var weightFirstBoxer = 78.2;
        var weightSecondBoxer = 82.7;
        System.out.println("weightFirstBoxer - " + weightFirstBoxer);
        System.out.println("weightSecondBoxer - " + weightSecondBoxer);
        var totalWeight = weightFirstBoxer + weightSecondBoxer;
        System.out.println("totalWeight - " + totalWeight);
        var differenceWeight = weightSecondBoxer - weightFirstBoxer;
        System.out.println("differenceWeight - " + differenceWeight);

        //Task 7

        var remainderFromDivisionWeight = weightSecondBoxer % weightFirstBoxer;
        System.out.println("remainder from division - " + remainderFromDivisionWeight);

        //Task 8

        // 1)

        var totalHours = 640;
        var hoursOfEachEmployee = 8;
        var totalEmployees = totalHours / hoursOfEachEmployee;
        System.out.println("The total number of employees in the company is " + totalEmployees + " people.");

        // 2)

        totalEmployees = totalEmployees + 94;
        totalHours =totalEmployees * hoursOfEachEmployee;
        System.out.println("If a company has " + totalEmployees + " employees, then " + totalHours +  " hours of work can be completed between employees.");

    }
}