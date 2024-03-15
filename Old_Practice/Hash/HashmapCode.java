 package Old_Practice.Hash;

import java.util.LinkedList;

public class HashmapCode {

    static class HashMap<K,V> {
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node> buckets[];

        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i = 0 ; i < 4; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        private int searchInLL(K key,int bi) {
            return 0;
        }

        private void rehash() {
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N * 2];

            for(int i = 0 ; i < N*2; i++) {
                buckets[i] = new LinkedList<>();
            }

            for(int i = 0 ; i < oldBucket.length ; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for(int j = 0 ; j < ll.size();j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key,V value) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di == -1) {
                buckets[bi].add(new Node(key, value));
                n++;
            } else {
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            double lamda = (double)n/N;
            if(lamda > 2.0) {
                rehash();
            }
        }
    }
    
}
