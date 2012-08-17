LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_SRC_FILES := calcvals.c
LOCAL_MODULE := calcvals

include $(BUILD_SHARED_LIBRARY)
