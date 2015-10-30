package cn.mutils.app.queue;

import cn.mutils.app.core.event.Listener;

public interface IQueueItemListener<QUEUE_ITEM extends IQueueItem<QUEUE_ITEM>> extends Listener {

	public void onException(QUEUE_ITEM task, Exception e);

	public void onStart(QUEUE_ITEM task);

	public void onStop(QUEUE_ITEM task);
}