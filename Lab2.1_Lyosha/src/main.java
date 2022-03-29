import java.util.Random;

public class main {
    public static void main(String[] args) {
        int[][] mas = new int[3][3];


        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = random.nextInt(2);
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }

        int row1 = mas[0][0]+mas[0][1]+mas[0][2]; //1-ий рядок матриці
        int row2 = mas[1][0]+mas[1][1]+mas[1][2]; //2-ий рядок матриці
        int row3 = mas[2][0]+mas[2][1]+mas[2][2]; //3-ий рядок матриці
        int col1 = mas[0][0]+mas[1][0]+mas[2][0]; //1-ий стовпчик матриці
        int col2 = mas[0][1]+mas[1][1]+mas[2][1]; //2-ий стовпчик матриці
        int col3 = mas[0][2]+mas[1][2]+mas[2][2]; //3 стовпчик матриці
        int mdiag = mas[0][0]+mas[1][1]+mas[2][2]; //головна діагональ
        int adiag = mas[0][2]+mas[1][1]+mas[2][0]; //побічна діагональ

        if(row1==col1 && row1==mdiag && col1==mdiag){
            System.out.println("Оскільки сума елементів рядка, діагоналі, стовпця співпадать, отримуємо: ");
            System.out.println("Рядок:");
            System.out.println("" +mas[0][0] +" "+mas[0][1]+" "+mas[0][2]);
            System.out.println("Стовпчик:");
            System.out.println("" +mas[0][0]+"\n"+mas[1][0]+"\n"+mas[2][0]);
            System.out.println("Діагональ:");
            System.out.println("" +mas[0][0]+"\n "+ mas[1][1]+"\n  "+mas[2][2]);
        }
        else if(row1==col1 &&row1==adiag && col1 == adiag){
            System.out.println("Оскільки сума елементів рядка, діагоналі, стовпця співпадать, отримуємо: ");
            System.out.println("Рядок:");
            System.out.println("" +mas[0][0] +" "+mas[0][1]+" "+mas[0][2]);
            System.out.println("Стовпчик:");
            System.out.println("" +mas[0][0]+"\n"+mas[1][0]+"\n"+mas[2][0]);
            System.out.println("Діагональ:");
            System.out.println("  " +mas[0][2]+"\n "+ mas[1][1]+"\n"+mas[2][0]);

        }
        else if(row1==col2 && row1 == mdiag &&  col2==mdiag){
            System.out.println("Оскільки сума елементів рядка, діагоналі, стовпця співпадать, отримуємо: ");
            System.out.println("Рядок:");
            System.out.println("" +mas[0][0] +" "+mas[0][1]+" "+mas[0][2]);
            System.out.println("Стовпчик:");
            System.out.println("" +mas[0][1]+"\n"+mas[1][1]+"\n"+mas[2][1]);
            System.out.println("Діагональ:");
            System.out.println("" +mas[0][0]+"\n "+ mas[1][1]+"\n  "+mas[2][2]);

        }
        else if(row1==col2 &&row1==adiag && col2==adiag){
            System.out.println("Оскільки сума елементів рядка, діагоналі, стовпця співпадать, отримуємо: ");
            System.out.println("Рядок:");
            System.out.println("" +mas[0][0] +" "+ mas[0][1]+" "+mas[0][2]);
            System.out.println("Стовпчик:");
            System.out.println("" +mas[0][1]+"\n"+mas[1][1]+"\n"+mas[2][1]);
            System.out.println("Діагональ:");
            System.out.println("  " +mas[0][2]+"\n "+ mas[1][1]+"\n"+mas[2][0]);


        }
        else if(row1==col3 &&row1==mdiag && col3==mdiag){
            System.out.println("Оскільки сума елементів рядка, діагоналі, стовпця співпадать, отримуємо: ");
            System.out.println("Рядок:");
            System.out.println("" +mas[0][0] +" "+mas[0][1]+" "+mas[0][2]);
            System.out.println("Стовпчик:");
            System.out.println("" +mas[0][2]+"\n"+mas[1][2]+"\n"+mas[2][2]);
            System.out.println("Діагональ:");
            System.out.println("" +mas[0][0]+"\n "+ mas[1][1]+"\n  "+mas[2][2]);

        }
        else if(row1==col3 &&row1==adiag && col3==adiag){
            System.out.println("Оскільки сума елементів рядка, діагоналі, стовпця співпадать, отримуємо: ");
            System.out.println("Рядок:");
            System.out.println("" +mas[0][0] +" "+mas[0][1]+" "+mas[0][2]);
            System.out.println("Стовпчик:");
            System.out.println("" +mas[0][2]+"\n"+mas[1][2]+"\n"+mas[2][2]);
            System.out.println("Діагональ:");
            System.out.println("  " +mas[0][2]+"\n "+ mas[1][1]+"\n"+mas[2][0]);

        }
        else if(row2==col1 &&row2==mdiag && col1==mdiag){
            System.out.println("Оскільки сума елементів рядка, діагоналі, стовпця співпадать, отримуємо: ");
            System.out.println("Рядок:");
            System.out.println("" +mas[1][0] +" "+mas[1][1]+" "+mas[1][2]);
            System.out.println("Стовпчик:");
            System.out.println("" +mas[0][0]+"\n"+mas[1][0]+"\n"+mas[2][0]);
            System.out.println("Діагональ:");
            System.out.println("" +mas[0][0]+"\n "+ mas[1][1]+"\n  "+mas[2][2]);

        }
        else if(row2==col1 &&row2==adiag && col1==adiag){
            System.out.println("Оскільки сума елементів рядка, діагоналі, стовпця співпадать, отримуємо: ");
            System.out.println("Рядок:");
            System.out.println("" +mas[1][0] +" "+mas[1][1]+" "+mas[1][2]);
            System.out.println("Стовпчик:");
            System.out.println("" +mas[0][0]+"\n"+mas[1][0]+"\n"+mas[2][0]);
            System.out.println("Діагональ:");
            System.out.println("  " +mas[0][2]+"\n "+ mas[1][1]+"\n"+mas[2][0]);

        }
        else if(row2==col2 &&row2==mdiag && col2==mdiag){
            System.out.println("Оскільки сума елементів рядка, діагоналі, стовпця співпадать, отримуємо: ");
            System.out.println("Рядок:");
            System.out.println("" +mas[1][0] +" "+mas[1][1]+" "+mas[1][2]);
            System.out.println("Стовпчик:");
            System.out.println("" +mas[0][1]+"\n"+mas[1][1]+"\n"+mas[2][1]);
            System.out.println("Діагональ:");
            System.out.println("" +mas[0][0]+"\n "+ mas[1][1]+"\n  "+mas[2][2]);

        }
        else if(row2==col2 &&row2==adiag && col2==adiag){
            System.out.println("Оскільки сума елементів рядка, діагоналі, стовпця співпадать, отримуємо: ");
            System.out.println("Рядок:");
            System.out.println("" +mas[1][0] +" "+mas[1][1]+" "+mas[1][2]);
            System.out.println("Стовпчик:");
            System.out.println("" +mas[0][1]+"\n"+mas[1][1]+"\n"+mas[2][1]);
            System.out.println("Діагональ:");
            System.out.println("  " +mas[0][2]+"\n "+ mas[1][1]+"\n"+mas[2][0]);

        }
        else if(row2==col3 &&row2==mdiag && col3==mdiag){
            System.out.println("Оскільки сума елементів рядка, діагоналі, стовпця співпадать, отримуємо: ");
            System.out.println("Рядок:");
            System.out.println("" +mas[1][0] +" "+mas[1][1]+" "+mas[1][2]);
            System.out.println("Стовпчик:");
            System.out.println("" +mas[0][2]+"\n"+mas[1][2]+"\n"+mas[2][2]);
            System.out.println("Діагональ:");
            System.out.println("" +mas[0][0]+"\n "+ mas[1][1]+"\n  "+mas[2][2]);

        }
        else if(row2==col3 &&row2==adiag && col3==adiag){
            System.out.println("Оскільки сума елементів рядка, діагоналі, стовпця співпадать, отримуємо: ");
            System.out.println("Рядок:");
            System.out.println("" +mas[1][0] +" "+mas[1][1]+" "+mas[1][2]);
            System.out.println("Стовпчик:");
            System.out.println("" +mas[0][2]+"\n"+mas[1][2]+"\n"+mas[2][2]);
            System.out.println("Діагональ:");
            System.out.println("  " + mas[0][2]+"\n "+ mas[1][1]+"\n"+mas[2][0]);

        }
        else if(row3==col1 && row3==mdiag && col1==mdiag){
            System.out.println("Оскільки сума елементів рядка, діагоналі, стовпця співпадать, отримуємо: ");
            System.out.println("Рядок:");
            System.out.println("" +mas[2][0] +" "+mas[2][1]+" "+mas[2][2]);
            System.out.println("Стовпчик:");
            System.out.println("" +mas[0][0]+"\n"+mas[1][0]+"\n"+mas[2][0]);
            System.out.println("Діагональ:");
            System.out.println("" +mas[0][0]+"\n "+ mas[1][1]+"\n  "+mas[2][2]);

        }
        else if(row3==col1 &&row3==adiag && col1==adiag){
            System.out.println("Оскільки сума елементів рядка, діагоналі, стовпця співпадать, отримуємо: ");
            System.out.println("Рядок:");
            System.out.println("" +mas[2][0] +" "+mas[2][1]+" "+mas[2][2]);
            System.out.println("Стовпчик:");
            System.out.println("" +mas[0][0]+"\n"+mas[1][0]+"\n"+mas[2][0]);
            System.out.println("Діагональ:");
            System.out.println("  " +mas[0][2]+"\n "+ mas[1][1]+"\n"+mas[2][0]);

        }
        else if(row3==col2 &&row3==mdiag && col2==mdiag){
            System.out.println("Оскільки сума елементів рядка, діагоналі, стовпця співпадать, отримуємо: ");
            System.out.println("Рядок:");
            System.out.println("" +mas[2][0] +" "+mas[2][1]+" "+mas[2][2]);
            System.out.println("Стовпчик:");
            System.out.println("" +mas[0][1]+"\n"+mas[1][1]+"\n"+mas[2][1]);
            System.out.println("Діагональ:");
            System.out.println("" +mas[0][0]+"\n "+ mas[1][1]+"\n  "+mas[2][2]);

        }
        else if(row3==col2 && row3==adiag && col2==adiag){
            System.out.println("Оскільки сума елементів рядка, діагоналі, стовпця співпадать, отримуємо: ");
            System.out.println("Рядок:");
            System.out.println("" +mas[2][0] +" "+mas[2][1]+" "+mas[2][2]);
            System.out.println("Стовпчик:");
            System.out.println("" +mas[0][1]+"\n"+mas[1][1]+"\n"+mas[2][1]);
            System.out.println("Діагональ:");
            System.out.println("  " +mas[0][2]+"\n "+ mas[1][1]+"\n"+mas[2][0]);


        }
        else if(row3==col3 &&row3==mdiag && col3==mdiag){
            System.out.println("Оскільки сума елементів рядка, діагоналі, стовпця співпадать, отримуємо: ");
            System.out.println("Рядок:");
            System.out.println("" +mas[2][0] +" "+mas[2][1]+" "+mas[2][2]);
            System.out.println("Стовпчик:");
            System.out.println("" +mas[0][2]+"\n"+mas[1][2]+"\n"+mas[2][2]);
            System.out.println("Діагональ:");
            System.out.println("" +mas[0][0]+"\n "+ mas[1][1]+"\n  "+mas[2][2]);
        }
        else if(row3==col3 &&row3==adiag && col3==adiag){
            System.out.println("Оскільки сума елементів рядка, діагоналі, стовпця співпадать, отримуємо: ");
            System.out.println("Рядок:");
            System.out.println("" +mas[2][0] +" "+mas[2][1]+" "+mas[2][2]);
            System.out.println("Стовпчик:");
            System.out.println("" +mas[0][2]+"\n"+mas[1][2]+"\n"+mas[2][2]);
            System.out.println("Діагональ:");
            System.out.println("  " +mas[0][2]+"\n "+ mas[1][1]+"\n"+mas[2][0]);
        }
        else {
            System.out.println("У масиві не знайдено однакових сум у рядку та стопчикі та діагоналі!");
        }
    }
}
