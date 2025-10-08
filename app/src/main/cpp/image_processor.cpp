#include "image_processor.h"

cv::Mat processFrame(cv::Mat &input) {
    cv::Mat gray, edges;
    cv::cvtColor(input, gray, cv::COLOR_RGBA2GRAY);
    cv::Canny(gray, edges, 100, 200);
    cv::cvtColor(edges, edges, cv::COLOR_GRAY2RGBA);
    return edges;
}
