public class Ex03 {
    public static void main(String[] args) {
        // 1. 다음과 같이 정사각형을 출력하는 코드 작성
        /*
        ----------
         *****
         *****
         *****
         *****
         *****
        ----------
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        {

        }int n = 5;
            for (int i = 0; i < n; i++) {

                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }


                for (int k = 0; k < 2 * i + 1; k++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }


// 2. 다음과 같이 삼각형을 출력하는 코드 작성
        /*
        ----------
         *
         **
         ***
         ****
         *****
        ----------
         */



// 3. 다음과 같이 삼각형을 출력하는 코드 작성
        /*
        ----------
             *
            ***
           *****
          ********
         **********
         ----------
         */

