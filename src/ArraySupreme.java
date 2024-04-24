import java.util.Random;

public class ArraySupreme {
    private int[] array;

    public ArraySupreme(int length) {
        array = new int[length];
        fillArrayRandomly();
    }

    private void fillArrayRandomly() {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(501) + 500; // Números aleatorios entre 500 y 1000
        }
    }

    public void printArray() {
        System.out.print("Arreglo generado: ");
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println(); // Salto de línea
    }

    public void printSumOfOddNumbers() {
        int sum = 0;
        System.out.print("Números impares en el arreglo: ");
        for (int number : array) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
                sum += number;
            }
        }
        System.out.println(); // Salto de línea
        System.out.println("La suma de los números impares en el arreglo es: " + sum);
    }

    public static void main(String[] args) {
        ArraySupreme arraySupreme = new ArraySupreme(10); // Cambia el tamaño del arreglo según tus necesidades
        arraySupreme.printArray();
        arraySupreme.printSumOfOddNumbers();
    }
}
