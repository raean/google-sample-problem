#include <stdio.h>
#include <string.h>
#include <stdlib.h>

char * Solution(char *S, int K) {

	int i = 0;
	int dashCount = 0;	
	while (i < strlen(S)) {
		if (S[i] == '-') {
			dashCount = dashCount + 1;
		}
		i = i + 1;	
	} 

	int groupCount = strlen(S) % K;
	int firstGroupLength = (strlen(S)/K) - (groupCount % K);

	char *result = (char*) malloc(sizeof(char));

	i = 0;
	while (i < firstGroupLength) {
		*result = S[i];
		i = i + 1;
		*(result)++;
	}	

	printf("%s\n", result);
	return result;

}

void main() {
	char S[] = "2-4A0r7-4k";
	int K = 4;
	int K2 = 3;
	
	char *result = Solution(S, K);
	printf("%s\n", "--------");
	char *result2 = Solution(S, K2);
	
}

