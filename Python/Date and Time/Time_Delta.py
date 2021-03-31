"""
When users post an update on social media,such as a URL, image, status update etc., other users in their network are able to view this new post on their news feed. Users can also see exactly when the post was published, i.e, how many hours, minutes or seconds ago.

Since sometimes posts are published and viewed in different time zones, this can be confusing. You are given two timestamps of one such post that a user can see on his newsfeed in the following format:

Day dd Mon yyyy hh:mm:ss +xxxx

Here +xxxx represents the time zone. Your task is to print the absolute difference (in seconds) between them.

Input Format

The first line contains T, the number of testcases.
Each testcase contains 2 lines, representing time t1 and t2 time .

Constraints

Input contains only valid timestamps
 year <= 3000.

Output Format

Print the absolute difference (t1-t2) in seconds.

Sample Input 0

2
Sun 10 May 2015 13:54:36 -0700
Sun 10 May 2015 13:54:36 -0000
Sat 02 May 2015 19:54:36 +0530
Fri 01 May 2015 13:54:36 -0000
Sample Output 0

25200
88200
Explanation 0

In the first query, when we compare the time in UTC for both the time stamps, we see a difference of 7 hours. which is 7*36000 seconds or 25200 seconds.

Similarly, in the second query, time difference is 5 hours and 30 minutes for time zone adjusting for that we have a difference of 1 day and 30 minutes. Or 24*3600 + 30*60 => 88200


"""
#datetime supplies classes for manipulating dates and times.
from datetime import datetime
import math
import os
import random
import re
import sys
from datetime import datetime

def time_delta(t1, t2):
    """Python datetime provides a method called .strptime() to handle strings that represents a date and time but isn’t in the ISO 8601 format.
     This method uses a special mini-language to tell Python which parts of the string are associated with the datetime attributes.

     For format_string = "%a %d %b %Y %H:%M:%S %z" the special characters are the following:

     Code 	Meaning 	                                            Example
     %a 	Weekday as locale’s abbreviated name. 	                Mon
     %d 	Day of the month as a zero-padded decimal number. 	    30
     %b 	Month as locale’s abbreviated name. 	                Sep
     %Y 	Year with century as a decimal number. 	                2013
     %H 	Hour (24-hour clock) as a zero-padded decimal number. 	07
     %M 	Minute as a zero-padded decimal number. 	            06
     %S 	Second as a zero-padded decimal number. 	            05
     %z 	UTC offset in the form +HHMM or -HHMM (empty string if the the object is naive).
     """
    format_string = "%a %d %b %Y %H:%M:%S %z"
    t1_datetime_obj = datetime.strptime(t1,format_string)
    t2_datetime_obj = datetime.strptime(t2,format_string)
    return (str(int(abs(t1_datetime_obj-t2_datetime_obj).total_seconds())))

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(input())

    for t_itr in range(t):
        t1 = input()

        t2 = input()

        delta = time_delta(t1, t2)

        fptr.write(delta + '\n')

    fptr.close()
