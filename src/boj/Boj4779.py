def recursion(line):
    if len(line) == 1:
        return line
    delimiter = int(len(line) / 3)
    return recursion(line[:delimiter]) + " " * delimiter + recursion(line[delimiter * 2:])

while True:
    try:
        n = input()
        line = "-" * (3 ** int(n))
        print(recursion(line))
    except:
        break

