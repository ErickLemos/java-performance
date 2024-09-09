# GC

types in JDK 21:
- SerialGC 
- ParallelGC
- G1GC
- ZGC

## Tips and Tricks

#### What GC select?
for initial case use G1GC, if your performance are poor, change to 
other garbage collector. Even though G1GC is recommended for machines
with more than one processor, In most cases, it will be more 
efficient due to its algorithm aimed at cleaning short-lived objects.

## SerialGC

recommended for:
- small data set application (up to approximately 100 MB).
- single processor and there are no pause-time requirements.

```shell
-XX:+UseSerialGC
```

## ParallelGC

recommended for:
- If (a) peak application performance is the first priority 
and (b) there are no pause-time requirements.
- pauses of one second or longer are acceptable.

```shell
-XX:+UseParallelGC
```

## G1GC

recommended for:
- if response time is more important than overall throughput 
and garbage collection pauses must be kept shorter.

```shell
-XX:+UseG1GC
```

## ZGC

recommended for:
- response time is a high priority.

```shell
-XX:+UseZGC 
-XX:+ZGenerational
```