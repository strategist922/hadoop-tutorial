#!/bin/sh
HADOOP_NODE_IP=ENTER YOUR HADOOP NODE IP HERE
rsync -av `pwd`/../hadoop-tutorial $HADOOP_NODE_IP:
