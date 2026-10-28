package estrutura_de_dados.recursao;

public class Calculadora {
    public static int fatoriaNaoRecursivo(int num) {
        if (num == 0) {
            return 1;
        }

        int total = 1;

        for(int i = num; i > 1; i--) {
            total *= i;
        }

        return total;
    }

    public static int fatoriaRecursivo(int num) {
        if(num == 0) {
            return 1;
        }

        return num * fatoriaRecursivo(num - 1);
    }

    public static int fibonacci(int num) {
        if(num == 0) {
            return 1;
        }

        if (num == 1) {
            return 1;
        }

        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public static int fibonacciSomatorio(int num) {
        if(num == 0) {
            return 1;
        }

        if (num == 1) {
            return 1;
        }

        return num + fibonacci(num - 1);
    }
}