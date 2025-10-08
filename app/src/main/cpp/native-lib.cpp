#include <jni.h>
#include "image_processor.h"

extern "C"
JNIEXPORT void JNICALL
Java_com_flam_demo_MainActivity_processFrameJNI(JNIEnv *env, jobject thiz, jlong inputMat, jlong outputMat) {
    cv::Mat &input = *(cv::Mat *) inputMat;
    cv::Mat &output = *(cv::Mat *) outputMat;
    output = processFrame(input);
}
