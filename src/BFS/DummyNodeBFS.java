//public class DummyNodeBFS {
//    // T 可以是任何你想存储的节点的类型
//    Queue<T> queue = new LinkedList<>();
//queue.offer(startNode);
//queue.offer(null);
//    currentLevel = 0;
//// 因为有 dummy node 的存在，不能再用 isEmpty 了来判断是否还有没有拓展的节点了
//while (queue.size() > 1) {
//        T head = queue.poll();
//        if (head == null) {
//            currentLevel++;
//            queue.offer(null);
//            continue;
//        }
//        for (all neighbors of head) {
//            queue.offer(neighbor);
//        }
//    }
//}
