import java.util.Scanner;
class Variables{
    public static void main(String args[]){
        Scanner TalkMe = new Scanner(System.in);
        int fnum, snum, answer;
        System.out.println("Enter first month users on TalkMe:");
        fnum = TalkMe.nextInt();
        System.out.println("Enter second month users on TalkMe:");
        snum = TalkMe.nextInt();
        answer = fnum+snum;
        System.out.println("Total users on TalkMe till now: "+answer);
        System.out.println("Congrats TalkMe Team your app is growing very fast!");
    }
}
