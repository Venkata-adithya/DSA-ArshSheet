public class ChoclateDistribution{

  /*Given an array of N integers where each value represents the number of chocolates in a packet. Each packet can have a variable number of 
   chocolates. There are m students, the task is to distribute chocolate packets such that: 

    Each student gets one packet.
    The difference between the number of chocolates in the packet with maximum chocolates and the packet with minimum chocolates 
    given to the students is minimum. */

  
  public int findMinDiff(int a[],int n,int m){
    if(m==0 && n==0)
      return 0;
    if(n<m)
      return -1;
    Arrays.sort(a);
    int minDiff=Integer.Max_Value;
    for(int i=0;i+m-1 < n;i++){
      int Diff=a[i+m-1]-a[i];
      if(Diff<minDiff)
        minDiff=Diff;
    }
    return minDiff;
  }
}
  
