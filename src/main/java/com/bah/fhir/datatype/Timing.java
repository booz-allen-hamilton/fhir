package com.bah.fhir.datatype;

import java.time.Duration;

public class Timing extends Element {

  private static final long serialVersionUID = 7584716983146277432L;

  private Repeat repeat;
  private TimingAbbreviation code;

  public Timing() {}

  public Repeat getRepeat() {
    return repeat;
  }

  public void setRepeat(Repeat repeat) {
    this.repeat = repeat;
  }

  public TimingAbbreviation getCode() {
    return code;
  }

  public void setCode(TimingAbbreviation code) {
    this.code = code;
  }

  public class Repeat extends Element {
    private static final long serialVersionUID = 3800115904498323828L;

    private Duration boundsQuantity;
    private Range boundsRange;
    private Period boundsPeriod;
    private int count;
    private double duration;
    private double durationMax;
    private UnitsOfTime durationUnits;
    private int frequency;
    private int frequencyMax;
    private double period;
    private double periodMax;
    private UnitsOfTime periodUnits;
    private EventTiming when;

    public Repeat() {}

    public Duration getBoundsQuantity() {
      return boundsQuantity;
    }

    public void setBoundsQuantity(Duration boundsQuantity) {
      this.boundsQuantity = boundsQuantity;
    }

    public Range getBoundsRange() {
      return boundsRange;
    }

    public void setBoundsRange(Range boundsRange) {
      this.boundsRange = boundsRange;
    }

    public Period getBoundsPeriod() {
      return boundsPeriod;
    }

    public void setBoundsPeriod(Period boundsPeriod) {
      this.boundsPeriod = boundsPeriod;
    }

    public int getCount() {
      return count;
    }

    public void setCount(int count) {
      this.count = count;
    }

    public double getDuration() {
      return duration;
    }

    public void setDuration(double duration) {
      this.duration = duration;
    }

    public double getDurationMax() {
      return durationMax;
    }

    public void setDurationMax(double durationMax) {
      this.durationMax = durationMax;
    }

    public UnitsOfTime getDurationUnits() {
      return durationUnits;
    }

    public void setDurationUnits(UnitsOfTime durationUnits) {
      this.durationUnits = durationUnits;
    }

    public int getFrequency() {
      return frequency;
    }

    public void setFrequency(int frequency) {
      this.frequency = frequency;
    }

    public int getFrequencyMax() {
      return frequencyMax;
    }

    public void setFrequencyMax(int frequencyMax) {
      this.frequencyMax = frequencyMax;
    }

    public double getPeriod() {
      return period;
    }

    public void setPeriod(double period) {
      this.period = period;
    }

    public double getPeriodMax() {
      return periodMax;
    }

    public void setPeriodMax(double periodMax) {
      this.periodMax = periodMax;
    }

    public UnitsOfTime getPeriodUnits() {
      return periodUnits;
    }

    public void setPeriodUnits(UnitsOfTime periodUnits) {
      this.periodUnits = periodUnits;
    }

    public EventTiming getWhen() {
      return when;
    }

    public void setWhen(EventTiming when) {
      this.when = when;
    }
  }
}
