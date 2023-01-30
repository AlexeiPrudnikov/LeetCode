    int FirstBadVersion(int n) {
        //if (n==1) return n;
        int currentIndex = n / 2;
        int minIndex = 1;
        int maxIndex = n;
        while (true){
            bool current = IsBadVersion(currentIndex);
            bool prev = IsBadVersion(currentIndex -1);
            if (currentIndex == 1) prev = false;
            if (current && !prev)
            return currentIndex;
            if (current){
                maxIndex = currentIndex;
                currentIndex = minIndex + (maxIndex - minIndex) / 2;
            }
            else{
                minIndex = currentIndex;
                currentIndex = minIndex + (maxIndex - minIndex) / 2;
            }
        }
    }
bool IsBadVersion (int version)
{
    
}