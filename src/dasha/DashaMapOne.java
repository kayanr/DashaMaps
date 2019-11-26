package dasha;

public class DashaMapOne implements HashMapX{
    Node[] dashaNode = new Node[26];

    private String HashFunctionOne(String input) {
        if (input.length() > 0) {
            return (String.valueOf(input.charAt(0)).toLowerCase());
        }
        return null;
    }

    public Integer convertChar(String key){
        String result = HashFunctionOne(key);
        char c = result.charAt(0);
        int index = c - 'a';

        return index;
    }

    @Override
    public void set(String key, Integer value) {
        Node newNew = new Node(key, value);
        String result = HashFunctionOne(key);
        int index = convertChar(result);

        Node head = dashaNode[index];

        if(head == null){ // added first item to list
            dashaNode[index] = newNew;
        }
        else{
            while(head.next != null){
                head = head.next;
            }
            head.next = newNew;
        }
    }

    @Override
    public void delete(String key) {
        String result = HashFunctionOne(key);
        int index = convertChar(result);

        Node current = dashaNode[index];

        if (current.key.equals(key)) {
            dashaNode[index] = current.next;
        }
        while (current.next != null) {
            if (current.next.key.equals(key)) {
                current.next = current.next.next;
            }
            current = current.next;
        }
    }

    @Override
    public Integer get(String key) {
        String result = HashFunctionOne(key);
        int index = convertChar(result);
        Node current = dashaNode[index];
        while (current != null){
            if(current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        if(size() == 0){
            return true;
        }
        return false;
    }

    @Override
    public long size() {
        int size = 0;
        for(int i = 0; i < dashaNode.length; i++){
            Node newNew = dashaNode[i];
            while(newNew != null){
                newNew = newNew.next;
                size++;
            }
        }
        return size;
    }

    @Override
    public long bucketSize(String key) {
        String result = HashFunctionOne(key);
        int index = convertChar(result);
        Node current = dashaNode[index];

        int length = 0;
        while(current != null){
            length++;
            current = current.next;
        }

        return length;
    }
}
