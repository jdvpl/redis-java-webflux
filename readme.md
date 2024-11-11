# conecto to reds

```
docker exec -it redis redis-cli
```

### Set data into Redis

```sh
SET key1 "value1"
SET key2 "value2"
SET key3 "value3"
SET key4 "value4"
SET key5 "value5"
```

### Get data from Redis

```sh
GET key1
GET key2
GET key3
GET key4
GET key5
```

### Delete specific keys from Redis

```sh
DEL key1
DEL key2
```

### Delete all keys from Redis

```sh
FLUSHALL
```

### Set data into Redis with expiration time

```sh
SETEX key1 60 "value1"  # Expires in 60 seconds
SETEX key2 120 "value2" # Expires in 120 seconds
SETEX key3 180 "value3" # Expires in 180 seconds
SETEX key4 240 "value4" # Expires in 240 seconds
SETEX key5 300 "value5" # Expires in 300 seconds
```

### Set data into Redis with expiration time using PX (milliseconds)

```sh
PSETEX key1 60000 "value1"  # Expires in 60000 milliseconds (60 seconds)
PSETEX key2 120000 "value2" # Expires in 120000 milliseconds (120 seconds)
PSETEX key3 180000 "value3" # Expires in 180000 milliseconds (180 seconds)
PSETEX key4 240000 "value4" # Expires in 240000 milliseconds (240 seconds)
PSETEX key5 300000 "value5" # Expires in 300000 milliseconds (300 seconds)
```
