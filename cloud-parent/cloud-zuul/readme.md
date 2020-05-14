想要拦截器生效，则需要问该服务的端口加其他服务的链接如：
    http://192.168.1.103:8889/eureka-consumer-feign/a/good
    前面是该服务的地址。
    eureka-consumer-feign是其他服务名，后面的链接；
    如果直接访问相应服务的地址，则拦截器不生效。
    
    ps：zuul主要是对外使用，
    内部之间的调用一般不走zuul，不然效率会很慢