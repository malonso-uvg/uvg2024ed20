import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class BinarySearchTreeTest {
    @Test
    public void testCount() {

        BinarySearchTree<Integer, String> arbolBST = new BinarySearchTree<Integer, String>(new NumberComparator<Integer>());
        assertEquals(0, arbolBST.count());

        arbolBST.insert(20, "Veinte");
        assertEquals(1, arbolBST.count());

        arbolBST.insert(30, "Treinta");
        arbolBST.insert(10, "Diez");
        assertEquals(3, arbolBST.count());

    }

    @Test
    public void testFind() {
        BinarySearchTree<Integer, String> arbolBST = new BinarySearchTree<Integer, String>(new NumberComparator<Integer>());

        arbolBST.insert(30, "Treinta");
        arbolBST.insert(20, "Veinte");
        arbolBST.insert(10, "Diez");
        arbolBST.insert(5, "Cinco");
        arbolBST.insert(90, "Noventa");
        arbolBST.insert(99, "Noventa y Nueve");
        arbolBST.insert(25, "Vienticinco");

        assertEquals("Treinta", arbolBST.find(30)); //Busco la raiz
        assertEquals("Noventa y Nueve", arbolBST.find(99)); //Busco el hijo más derecho
        assertEquals("Cinco", arbolBST.find(5)); //Busco el hijo mas izquierdo
        assertNull(arbolBST.find(100)); //El numero 100 no se encuentra
    }

    @Test
    public void testInsert() {
        BinarySearchTree<Integer, String> arbolBST = new BinarySearchTree<Integer, String>(new NumberComparator<Integer>());
        assertEquals(0, arbolBST.count());

        arbolBST.insert(30, "Treinta");
        arbolBST.insert(20, "Veinte");
        arbolBST.insert(10, "Diez");
        arbolBST.insert(5, "Cinco");
        arbolBST.insert(90, "Noventa");
        arbolBST.insert(99, "Noventa y Nueve");
        arbolBST.insert(25, "Vienticinco");

        assertFalse(arbolBST.isEmpty());
        

    }

    @Test
    public void testIsEmpty() {
        BinarySearchTree<Integer, String> arbolBST = new BinarySearchTree<Integer, String>(new NumberComparator<Integer>());
        assertTrue(arbolBST.isEmpty());

        arbolBST.insert(20, "Hola");
        assertFalse(arbolBST.isEmpty());
        
    }

    @Test
    public void testInOrderWalk() {
        BinarySearchTree<Integer, String> arbolBST = new BinarySearchTree<Integer, String>(new NumberComparator<Integer>());

        arbolBST.insert(30, "Treinta");
        arbolBST.insert(20, "Veinte");
        arbolBST.insert(10, "Diez");
        arbolBST.insert(5, "Cinco");
        arbolBST.insert(90, "Noventa");
        arbolBST.insert(99, "Noventa y Nueve");
        arbolBST.insert(25, "Vienticinco");

        //Creo el arrayList que debería ser resultante
        ArrayList<String> arregloEsperado = new ArrayList<String>();
        arregloEsperado.add("Cinco");
        arregloEsperado.add("Diez");
        arregloEsperado.add("Veinte");
        arregloEsperado.add("Vienticinco");
        arregloEsperado.add("Treinta");
        arregloEsperado.add("Noventa");
        arregloEsperado.add("Noventa y Nueve");

        //Creo el objeto del recorrido
        SaveInArrayListWalk<String> recorridoEnOrden = new SaveInArrayListWalk<String>();
        arbolBST.InOrderWalk(recorridoEnOrden); //Guardo todos los valores a través del recorrido

        //Verifico que tanto el arreglo esperado como el arreglo generado por el recorrido tengan el mismo tamaño
        assertEquals(arregloEsperado.size(), recorridoEnOrden.getListado().size());

        //Verifico todas las posiciones
        for (int i = 0; i < arregloEsperado.size(); i++){
            assertEquals(arregloEsperado.get(i), recorridoEnOrden.getListado().get(i));
        }
        
    }
}
