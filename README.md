The original idea is from  
https://medium.com/spring-boot-tips-and-tricks/resolving-circular-dependencies-in-spring-with-dynamic-proxies-and-lazy-annotation-a38c51f57fe9

# With Interfaces
Use setter injection with the @Lazy annotation to inject the dependencies.

# Without Interfaces
Use setter injection with the @Lazy annotation to inject the dependencies.
Spring will use CGLIB to create a subclass proxy of these beans