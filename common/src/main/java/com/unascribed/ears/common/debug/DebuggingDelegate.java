package com.unascribed.ears.common.debug;

import com.unascribed.ears.common.render.EarsRenderDelegate;

/**
 * A wrapper around another EarsRenderDelegate that {@link EarsLog logs} everything performed.
 */
public class DebuggingDelegate implements EarsRenderDelegate {

	private final EarsRenderDelegate delegate;

	public DebuggingDelegate(EarsRenderDelegate delegate) {
		this.delegate = delegate;
	}

	@Override
	public void push() {
		EarsLog.debug("Platform:Renderer:Delegate", "push()");
		delegate.push();
	}

	@Override
	public void pop() {
		EarsLog.debug("Platform:Renderer:Delegate", "pop()");
		delegate.pop();
	}

	@Override
	public void anchorTo(BodyPart part) {
		EarsLog.debug("Platform:Renderer:Delegate", "anchorTo(BodyPart.{})", part);
		delegate.anchorTo(part);
	}

	@Override
	public void translate(float x, float y, float z) {
		EarsLog.debug("Platform:Renderer:Delegate", "translate({}, {}, {})", x, y, z);
		delegate.translate(x, y, z);
	}

	@Override
	public void rotate(float ang, float x, float y, float z) {
		EarsLog.debug("Platform:Renderer:Delegate", "rotate({}, {}, {}, {})", ang, x, y, z);
		delegate.rotate(ang, x, y, z);
	}

	@Override
	public void renderFront(int u, int v, int w, int h, TexRotation rot, TexFlip flip, QuadGrow grow) {
		EarsLog.debug("Platform:Renderer:Delegate", "renderFront({}, {}, {}, {}, {}, {}, {})", u, v, w, h, rot, flip, grow);
		delegate.renderFront(u, v, w, h, rot, flip, grow);
	}

	@Override
	public void renderBack(int u, int v, int w, int h, TexRotation rot, TexFlip flip, QuadGrow grow) {
		EarsLog.debug("Platform:Renderer:Delegate", "renderBack({}, {}, {}, {}, {}, {}, {})", u, v, w, h, rot, flip, grow);
		delegate.renderBack(u, v, w, h, rot, flip, grow);
	}
	
	@Override
	public void renderDoubleSided(int u, int v, int w, int h, TexRotation rot, TexFlip flip, QuadGrow grow) {
		EarsLog.debug("Platform:Renderer:Delegate", "renderDoubleSided({}, {}, {}, {}, {}, {}, {})", u, v, w, h, rot, flip, grow);
		delegate.renderDoubleSided(u, v, w, h, rot, flip, grow);
	}

	@Override
	public void renderDebugDot(float r, float g, float b, float a) {
		EarsLog.debug("Platform:Renderer:Delegate", "renderDebugDot({}, {}, {}, {})", r, g, b, a);
		delegate.renderDebugDot(r, g, b, a);
	}

	@Override
	public void bind(TexSource tex) {
		EarsLog.debug("Platform:Renderer:Delegate", "bind({})", tex);
		delegate.bind(tex);
	}

	@Override
	public void scale(float x, float y, float z) {
		EarsLog.debug("Platform:Renderer:Delegate", "scale({}, {}, {})", x, y, z);
		delegate.scale(x, y, z);
	}

	@Override
	public void setUp() {
		EarsLog.debug("Platform:Renderer:Delegate", "setUp()");
		delegate.setUp();
	}

	@Override
	public void tearDown() {
		EarsLog.debug("Platform:Renderer:Delegate", "tearDown()");
		delegate.tearDown();
	}

	@Override
	public float getTime() {
		float t = delegate.getTime();
		EarsLog.debug("Platform:Renderer:Delegate", "getTime() -> {}", t);
		return t;
	}

	@Override
	public boolean isFlying() {
		boolean b = delegate.isFlying();
		EarsLog.debug("Platform:Renderer:Delegate", "isFlying() -> {}", b);
		return b;
	}

	@Override
	public boolean isGliding() {
		boolean b = delegate.isGliding();
		EarsLog.debug("Platform:Renderer:Delegate", "isGliding() -> {}", b);
		return b;
	}

	@Override
	public boolean isWearingElytra() {
		boolean b = delegate.isWearingElytra();
		EarsLog.debug("Platform:Renderer:Delegate", "isWearingElytra() -> {}", b);
		return b;
	}

	@Override
	public boolean isWearingChestplate() {
		boolean b = delegate.isWearingChestplate();
		EarsLog.debug("Platform:Renderer:Delegate", "isWearingChestplate() -> {}", b);
		return b;
	}

	@Override
	public boolean isWearingBoots() {
		boolean b = delegate.isWearingBoots();
		EarsLog.debug("Platform:Renderer:Delegate", "isWearingBoots() -> {}", b);
		return b;
	}

	@Override
	public boolean isJacketEnabled() {
		boolean b = delegate.isJacketEnabled();
		EarsLog.debug("Platform:Renderer:Delegate", "isJacketEnabled() -> {}", b);
		return b;
	}

	@Override
	public Object getPeer() {
		return delegate.getPeer();
	}
	
	@Override
	public boolean needsSecondaryLayersDrawn() {
		boolean b = delegate.needsSecondaryLayersDrawn();
		EarsLog.debug("Platform:Renderer:Delegate", "needsSecondaryLayersDrawn() -> {}", b);
		return b;
	}
	
}
