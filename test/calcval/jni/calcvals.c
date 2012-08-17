#include "calcvals.h"

jint
Java_com_example_calcval_MainActivity_addVals( JNIEnv* env, jobject thiz, jint a, jint b )
{
	return a + b;
}