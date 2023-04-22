/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gt.edu.umg.progra3;

/**
 *
 * @author melgust
 */
public class StaticHashTable {

    final int TOTAL_ITEMS = 7;
    int count = 0;
    int[] array = new int[TOTAL_ITEMS];

    public StaticHashTable() {
        for (int i = 0; i < TOTAL_ITEMS; i++) {
            array[i] = -1;
        }
    }

    public int hash(int value) {
        return (value % TOTAL_ITEMS) == 0 ? 0 : (value % TOTAL_ITEMS) - 1;
    }

    public void put(int value) {
        if (count >= TOTAL_ITEMS) {
            System.out.println("Ya no hay espacio disponible");
            return;
        }
        if (value < 0) {
            System.out.println("Numero invalido");
        } else {
            int index = hash(value);
            if (array[index] == -1) {
                array[index] = value;
                count++;
            } else {
                boolean inserted = false;
                int tmp = index + 1;
                while (tmp < TOTAL_ITEMS) {
                    if (array[tmp] == -1) {
                        array[tmp] = value;
                        count++;
                        inserted = true;
                        break;
                    }
                    tmp++;
                }
                if (!inserted) {
                    tmp = index - 1;
                    while (tmp >= 0) {
                        if (array[tmp] == -1) {
                            array[tmp] = value;
                            count++;
                            break;
                        }
                        tmp--;
                    }
                }
            }
        }
    }
    
    public void listar() {
        for (int i = 0; i < TOTAL_ITEMS; i++) {
            System.out.println(array[i]);
        }
    }

}
