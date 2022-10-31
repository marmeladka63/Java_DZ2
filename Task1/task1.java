
// Написать программу, показывающую последовательность действий для игры “Ханойская башня”
class MyProgram {
   public static void main(String[] args) {
        hanoiTouwer(3, "1", "2", "3");
    }
// n - количество колец
// stick1, stick2, stick3 - стрежни на котрые нанизываются кольца
public static void hanoiTouwer( int n, String stick1, String stick2, String stick3){
    if (n ==1 ) {
        System.out.printf("%d from %s to %s", n, stick1, stick3 );
        System.out.println();
        return;
    }
    hanoiTouwer(n-1, stick1, stick3, stick2);
    System.out.printf("%d from %s to %s", n, stick1, stick3);
    System.out.println();
    hanoiTouwer(n-1, stick2, stick1, stick3);
}
}