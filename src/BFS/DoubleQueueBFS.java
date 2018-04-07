//public class DoubleQueueBFS {
//    Queue<T> queue1 = new LinkedList<>();
//    Queue<T> queue2 = new LinkedList<>();
//queue1.offer(startNode);
//    int currentLevel = 0;
//
//while (!queue1.isEmpty()) {
//        for (int i = 0; i < queue.size(); i++) {
//            T head = queue1.poll();
//            for (all neighbors of head) {
//                queue2.offer(neighbor);
//            }
//        }
//        Queue<T> temp = queue1;
//        queue1 = queue2;
//        queue2 = temp;
//
//        queue2.clear();
//        currentLevel++;
//    }
//}
