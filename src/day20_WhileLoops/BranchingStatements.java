package day20_WhileLoops;

public class BranchingStatements {
    public static void main(String[] args) {

        char ch = 'A';

        while (ch <= 'E'){
            if (ch == 'C'){
                ch++;
                continue; //Skips everything even the iterator thats way I put it before
            }
            System.out.println(ch);
            ch++;

        }

    }
}
