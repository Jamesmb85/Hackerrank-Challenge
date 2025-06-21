

//helper function
float calculateArea(struct triangle t){
    float p = (t.a + t.b + t.c)/2.0;
    return sqrt(p*(p-t.a)*(p-t.b)*(p-t.c));
}

void sort_by_area(triangle* tr, int n) {
	/**
	* Sort an array a of the length n
	*/
    for (int i = 0; i < n; i++)
        for (int j = i + 1; j < n; j++)
            if (calculateArea(tr[i]) > calculateArea(tr[j]))
            {
                struct triangle temp = tr[i];
                tr[i] = tr[j];
                tr[j] = temp;
            }
    
}

