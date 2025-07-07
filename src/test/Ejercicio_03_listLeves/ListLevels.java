package test.Ejercicio_03_listLeves;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import main.Materia.Models.Node;

/**
 * Clase que lista los niveles de un árbol binario como listas.
 */
public class ListLevels {

    /**
     * Devuelve una lista de listas, donde cada lista contiene los nodos de un nivel.
     *
     * @param root raíz del árbol
     * @return lista de niveles
     */
    public List<List<Node>> listLevels(Node root) {
        List<List<Node>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Node> level = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                level.add(node);
                if (node.getLeft() != null) queue.offer(node.getLeft());
                if (node.getRight() != null) queue.offer(node.getRight());
            }

            result.add(level);
        }

        return result;
    }
}
