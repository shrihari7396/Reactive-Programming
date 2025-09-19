package springboot.lear.reactiveProgramming;

import org.junit.jupiter.api.Test;
import org.reactivestreams.Subscription;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.CoreSubscriber;
import reactor.core.publisher.Mono;

@SpringBootTest
class ReactiveProgrammingLearningApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void firstTest() {
		Mono<String> mono = Mono.just("Testing");

		mono.subscribe(new CoreSubscriber<String>() {
			@Override
			public void onSubscribe(Subscription s) {
				System.out.println("Subscribed Successfully !!!");
				s.request(1);
			}
			@Override
			public void onNext(String data) {
				System.out.println("data :-" + data);
			}
			@Override
			public void onError(Throwable t) {
				System.out.println("error :-" + t.getMessage());
			}
			@Override
			public void onComplete() {
				System.out.println("Completed Successfully !!!");
			}
		});
	}

}
