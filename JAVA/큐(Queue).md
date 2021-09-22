# 큐(Queue)

- Queue란 Collection 프레임워크의 일부이며 java.util 패키지에 소속되어 있습니다
- Queue는 사전적으로 "줄을 서다"를 의미합니다. 줄을 서서 기다린다는 것처럼 먼저 들어오면 데이터가 먼저 나가는 형식입니다
- 일명 FIFO(FirstInFirstOut) 방식입니다.반대로 Stack은 LIFO방식이라 두 개가 많이 비교됩니다

# 큐(Queue) 선언

- `Queue<String> str = new LinkedList<String>()`
- 자바에서의 Queue의 선언방법은 Queue로 생성을 하면 안 되고 LinkedList로 생성을 해야합니다. LinkedList를 사용하기 때문에 Queue와 LinkedList를 모두 import해야합니다

# 큐(Queue) 메소드

### 값 추가

- `queue.add(1); // queue에 1 추가`     
- `queue.offer(2); // queue에 2 추가`

### 값 삭제

- `queue.poll();       // queue에 첫번째 값을 반환하고 제거 비어있다면 null`
- `queue.remove();     // queue에 첫번째 값 제거`
- `queue.clear();      // queue 초기화`

### 가장 먼저 들어간 값 출력

- `queue.peek();       // queue의 첫번째 값 참조`
