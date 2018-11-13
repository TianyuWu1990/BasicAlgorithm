package HighFrequency;

/*
There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

You may assume nums1 and nums2 cannot be both empty.

Example 1:

nums1 = [1, 3]
nums2 = [2]

The median is 2.0
Example 2:

nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5
求两个有序数组的中位数，限制了时间复杂度O(log (m+n))。

如果m+n为奇数，则中位数为AB[(m+n)/2 + 1]，偶数的话，中位数为(AB[(m+n)/2] + AB[(m+n)/2 + 1])/2。

如果没有时间复杂度O(log(m+n))的要求，就可以对两个数组使用归并排序，再找到他们的中位数，直接遍历两个数组查找，用2个变量分别指向两个数组，每次取较小的一个，然后将其指针后移动，直到找到中位数，时间复杂度为O(m+n)。但不是题目想要考察的。

解法：二分搜索Binary Search，T：O(log(m+n))。两个有序数组A(m), B(n)，k = (m+n)/2，奇数时找k+1大的数，偶数是找第k大和第k+1大的数在除2。找第k((m+n)/2)大的数。先在A，B中分别找第k/2大的数，如果A[k/2-1]==B[k/2-1]，那么这个数就是两个数组中第k大的数。如果A[k/2-1]<B[k/2-1], 那么说明A[0]到A[k/2-1]都不可能是第k大的数，所以需要舍弃这k/2，继续从A[k/2]到A[A.length-1]继续找。当然，因为这里舍弃了A[0]到A[k/2-1]这k/2个数，那么第k大也就变成了第k-k/2个大的数了。如果 A[k/2-1]>B[k/2-1]，那么说明B[0]到B[k/2-1]都不可能是第k大的数，舍弃这k/2。如此迭代或者递归操作，如果有一个数组为空了，则返回另一个数组的第k大(剩下需要二分长度)的数。如果k==1，只需返回此时所以数中排第一小的数，就返回此时A，B中第一个元素小的那个。
 */
public class MedianOfTwoSortedArray {

}
