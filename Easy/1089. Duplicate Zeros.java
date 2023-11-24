 class Solution {
    public void duplicateZeros(int[] arr){
    
        Queue<Integer> queue = new LinkedList<>();
        int n = arr.length;
        
        for (int i : arr) {
            if (i == 0) {
                queue.add(0);
                queue.add(0);
            } else {
                queue.add(i);
            }
        }

        int index = 0;
        while (index < n) {
            arr[index] = queue.poll();
            index++;
        }
    }
}

