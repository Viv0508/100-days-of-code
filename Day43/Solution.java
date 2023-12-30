import java.util.LinkedList;

class Solution {
    public boolean isHappy(int n) {
        
        int slow = n;
        int fast = n;
        
        do {

            slow = square(slow);
            fast = square(square(fast));
        } while (slow != fast);

        return slow ==1;
    }

    public int square(int num) {
        int ans = 0 ;

        while(num > 0 ) {
            int reminder = num % 10;
            ans+= reminder * reminder;
            num/= 10;
        }
        return ans;
    }
}
