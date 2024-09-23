//package linked;
//
//public class mergeSort {
//
//    public ListNode sortList(ListNode head) {
//             if (head == null|| head,next=null) {
//             return head;
//             }
//             ListNode mid=getmid(head);
//             ListNode left=sortList(head);
//             ListNode right=sortList(mid);
//             return merge(left,right);
//    }
//    }
//    public static ListNode merge(ListNode first,ListNode second)
//    {
//        ListNode f=first.head;
//        ListNode s=second.head;
//        ListNode ans=new ListNode();
//        while(f!=null && s!=null) {
//            if (f.value < s.value) {
//                ans.insertLast(f.value);
//                f = f.next;
//            } else {
//                ans.insertLast(s.value);
//                s = s.next;
//            }
//        }
//        if(f!=null)
//        {
//            ans.insertLast(f.value);
//            f=f.next;
//        }
//        if(s!=null)
//        {
//            ans.insertLast(s.value);
//            s=s.next;
//        }
//    public void getmid()
//    {
//        ListNode f=head;
//        ListNode  s=head;
//        if(s.next==null)
//        {
//            System.out.println(head.value);
//            return;
//        }
//        while(f!=null && f.next!=null)
//        {
//            f=f.next.next;
//            s=s.next;
//        }
//        System.out.println(s.value);
//    }
//}
