package trabajo.practico;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		testBFSForest();
		testDFSForest();
		testCaminos();
	}

	public static void testBFSForest() {
		GrafoDirigido<Integer> grafo = new GrafoDirigido<>();

		// grafo.agregarVertice(1); // D
		// grafo.agregarVertice(2); // B
		// grafo.agregarVertice(3); // C
		// grafo.agregarVertice(4); // H
		// grafo.agregarVertice(5); // R
		// grafo.agregarVertice(6); // A
		// grafo.agregarVertice(7); // T
		//
		// grafo.agregarArco(1, 2, 0); // D - B
		// grafo.agregarArco(1, 3, 0); // D - C
		// grafo.agregarArco(2, 4, 0); // B - H
		// grafo.agregarArco(3, 5, 0); // C - R
		// grafo.agregarArco(4, 6, 0); // H - A
		// grafo.agregarArco(4, 7, 0); // H - T

		grafo.agregarVertice(1); // A
		grafo.agregarVertice(2); // B
		grafo.agregarVertice(3); // C
		grafo.agregarVertice(4); // D
		grafo.agregarVertice(5); // E

		grafo.agregarArco(1, 2, null);
		grafo.agregarArco(1, 3, null);
		grafo.agregarArco(2, 4, null);
		grafo.agregarArco(3, 4, null);
		grafo.agregarArco(3, 5, null);
		grafo.agregarArco(4, 5, null);

		ServicioBFS<Integer> servicioBFS = new ServicioBFS<>(grafo);
		List<Integer> bfsForest = servicioBFS.bfsForest();

		System.out.println("Servicio BFS Forest:");
		for (Integer vertice : bfsForest) {
			System.out.println(vertice);
		}
	}

	public static void testDFSForest() {
		GrafoDirigido<Integer> grafo = new GrafoDirigido<>();

		// grafo.agregarVertice(1); // D
		// grafo.agregarVertice(2); // B
		// grafo.agregarVertice(3); // C
		// grafo.agregarVertice(4); // H
		// grafo.agregarVertice(5); // R
		// grafo.agregarVertice(6); // A
		// grafo.agregarVertice(7); // T
		//
		// grafo.agregarArco(1, 2, 0); // D - B
		// grafo.agregarArco(1, 3, 0); // D - C
		// grafo.agregarArco(2, 4, 0); // B - H
		// grafo.agregarArco(3, 5, 0); // C - R
		// grafo.agregarArco(4, 6, 0); // H - A
		// grafo.agregarArco(4, 7, 0); // H - T

		grafo.agregarVertice(1); // A
		grafo.agregarVertice(2); // B
		grafo.agregarVertice(3); // C
		grafo.agregarVertice(4); // D
		grafo.agregarVertice(5); // E

		grafo.agregarArco(1, 2, null);
		grafo.agregarArco(1, 3, null);
		grafo.agregarArco(2, 4, null);
		grafo.agregarArco(3, 4, null);
		grafo.agregarArco(3, 5, null);
		grafo.agregarArco(4, 5, null);

		ServicioDFS<Integer> servicioDFS = new ServicioDFS<>(grafo);
		List<Integer> dfsForest = servicioDFS.dfsForest();

		System.out.println("Servicio DFS Forest:");
		for (Integer vertice : dfsForest) {
			System.out.println(vertice);
		}
	}

	public static void testCaminos() {
		GrafoDirigido<Integer> grafo = new GrafoDirigido<>();

		grafo.agregarVertice(1); // A
		grafo.agregarVertice(2); // B
		grafo.agregarVertice(3); // C
		grafo.agregarVertice(4); // D
		grafo.agregarVertice(5); // E

		grafo.agregarArco(1, 2, null);
		grafo.agregarArco(1, 3, null);
		grafo.agregarArco(2, 4, null);
		grafo.agregarArco(3, 4, null);
		grafo.agregarArco(3, 5, null);
		grafo.agregarArco(4, 5, null);

		ServicioCaminos<Integer> servicioCaminos = new ServicioCaminos<>(grafo, 1, 5, 45);
		List<List<Integer>> caminos = servicioCaminos.caminos();

		System.out.println("Caminos Posibles:");
		for (List<Integer> camino : caminos) {
			System.out.println(camino);
		}
	}
}
