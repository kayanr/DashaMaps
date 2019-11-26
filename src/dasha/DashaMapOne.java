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
    public String delete(String key) {

        return null;
    }

    @Override
    public Integer get(String key) {
        String result = HashFunctionOne(key);
        int index = convertChar(key);
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
        return false;
    }

    @Override
    public long size() {
        return 0;
    }

    @Override
    public boolean bucketSize(String key) {
        return false;
    }
}
