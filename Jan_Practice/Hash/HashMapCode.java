package Jan_Practice.Hash;

import java.util.*;;

public class HashMapCode {
    static class HashMap<K,V> { 
        private class Node {
            K key;
            V value;
            public Node(K Key, V value) {
                this.key = key;
                this.value = value;
            }      
        }

        private int n; // no of nodes
        private int N; // no of buckets
        private LinkedList<Node> buckets[]; //N = buckets.length

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i = 0 ; i <4 ; i++) {
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key) {
            int bi = key.hashCode();
            return Math.abs(bi) % N;
        }

        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];

            for(int i = 0 ; i < ll.size() ;i++) {
                if(ll.get(i).key == key) {
                    return i; //di
                }
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N * 2];

            for(int i=0; i<N*2; i++) {
                buckets[i] = new LinkedList<>();
            }

            for(int i = 0 ; i < N * 2 ; i++) {
                LinkedList<Node> ll = oldBucket[i];
                for(int j = 0 ; j < ll.size() ; j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = searchInLL(key,bi); // di = -1

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
