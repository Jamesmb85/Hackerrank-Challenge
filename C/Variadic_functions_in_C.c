
int  sum (int count,...) {
    va_list args; //holds information about which argument we’re going to get next with va_arg()
    va_start(args, count);// Start with arguments after "count"

    int result = 0;
    for (int i = 0; i < count; i++) {
        result += va_arg(args, int); // Get the next int
    }

    va_end(args);
    return result;

}

int min(int count,...) {
    va_list args;
    va_start(args, count);

    int result = va_arg(args, int);
    for (int i = 1; i < count; i++) {
        int current = va_arg(args, int);
        if (current < result) {
            result = current;
        }
    }

    va_end(args);
    return result;

}

int max(int count,...) {
    va_list args;
    va_start(args, count);

    int result = va_arg(args, int);
    for (int i = 1; i < count; i++) {
        int current = va_arg(args, int);
        if (current > result) {
            result = current;
        }
    }

    va_end(args);
    return result;

}

