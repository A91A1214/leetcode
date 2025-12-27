class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
for (int i = 0; i < apple.length; i++)
    sum += apple[i];

Arrays.sort(capacity);

int x = sum;
int count = 0;

for (int i = capacity.length - 1; i >= 0; i--) {
    if (x > 0) {
        x -= capacity[i];
        count++;
    }
    if (x <= 0)
        break;
}
return count;
    }
}