package ch11.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Message> queue = new LinkedList<>();
        queue.offer(new Message("sendKakaoTalk", "제니"));
        queue.offer(new Message("sendSms", "리사"));
        queue.offer(new Message("sendMail", "로제"));

        // switch-case문 이용해서 특정 command일 경우 각각 출력문 다르게
        for (Message msg : queue) {
            switch (msg.getCommand()) {
                case "sendKakaoTalk" -> System.out.println(msg.getTo() + "에게 카톡");
                case "sendSms" -> System.out.println(msg.getTo() + "에게 문자");
                case "sendMail" -> System.out.println(msg.getTo() + "에게 메일");
            }
        }

    }
}
