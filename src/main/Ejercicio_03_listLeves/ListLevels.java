package main.Ejercicio_03_listLeves;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import main.Materia.Models.Node;

public class ListLevels {

    /**
     * Retorna una lista de listas, donde cada sublista contiene los nodos de un nivel del árbol.
     *
     * @param root la raíz del árbol binario
     * @return lista con nodos agrupados por niveles
     */
    public List<List<Node>> listLevels(Node root) {
        List<List<Node>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Node> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                Node current = queue.poll();
                currentLevel.add(current);

                if (current.getLeft() != null) {
                    queue.offer(current.getLeft());
                }
                if (current.getRight() != null) {
                    queue.offer(current.getRight());
                }
            }

            result.add(currentLevel);
        }

        return result;
    }
}
