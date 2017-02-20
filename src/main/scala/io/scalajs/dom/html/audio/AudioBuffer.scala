package io.scalajs.dom.html.audio

import scala.scalajs.js
import scala.scalajs.js.typedarray.Float32Array

/**
  * The AudioBuffer interface represents a short audio asset residing in memory, created from
  * an audio file using the AudioContext.decodeAudioData() method, or from raw data using
  * AudioContext.createBuffer(). Once put into an AudioBuffer, the audio can then be played
  * by being passed into an AudioBufferSourceNode.
  * *
  * Objects of these types are designed to hold small audio snippets, typically less than 45 s. For longer sounds,
  * objects implementing the MediaElementAudioSourceNode are more suitable. The buffer contains data in the following
  * format:  non-interleaved IEEE754 32-bit linear PCM with a nominal range between -1 and +1, that is,
  * 32bits floating point buffer, with each samples between -1.0 and 1.0. If the AudioBuffer has multiple channels,
  * they are stored in separate buffer.
  * @see https://developer.mozilla.org/en-US/docs/Web/API/AudioBuffer
  */
@js.native
class AudioBuffer() extends js.Object {

  /////////////////////////////////////////////////////////////////////////////////
  //      Properties
  /////////////////////////////////////////////////////////////////////////////////

  /**
    * Returns a float representing the sample rate, in samples per second, of the PCM data stored in the buffer.
    */
  def sampleRate: Double = js.native

  /**
    * Returns an integer representing the length, in sample-frames, of the PCM data stored in the buffer.
    */
  def length: Int = js.native

  /**
    * Returns a double representing the duration, in seconds, of the PCM data stored in the buffer.
    */
  def duration: Double = js.native

  /**
    * Returns an integer representing the number of discrete audio channels described by the PCM data stored in the buffer.
    */
  def numberOfChannels: Int = js.native

  /////////////////////////////////////////////////////////////////////////////////
  //      Methods
  /////////////////////////////////////////////////////////////////////////////////

  /**
    * Returns a Float32Array containing the PCM data associated with the channel, defined by the
    * channel parameter (with 0 representing the first channel).
    */
  def getChannelData(): Float32Array = js.native

  /**
    * Copies the samples from the specified channel of the AudioBuffer to the destination array.
    * @param destination    A Float32Array to copy the channel data to.
    * @param channelNumber  The channel number of the current AudioBuffer to copy the channel data from.
    *                       If channelNumber is greater than or equal to AudioBuffer.numberOfChannels,
    *                       an INDEX_SIZE_ERR will be thrown.
    * @param startInChannel An optional offset to copy the data from. If startInChannel is greater
    *                       than AudioBuffer.length, an INDEX_SIZE_ERR will be thrown.
    */
  def copyFromChannel(destination: Float32Array, channelNumber: Int, startInChannel: Int = js.native): Unit = js.native

  /**
    * Copies the samples to the specified channel of the AudioBuffer, from the source array.
    * @param source         A Float32Array that the channel data will be copied from.
    * @param channelNumber  The channel number of the current AudioBuffer to copy the channel data to.
    *                       If channelNumber is greater than or equal to AudioBuffer.numberOfChannels,
    *                       an INDEX_SIZE_ERR will be thrown.
    * @param startInChannel An optional offset to copy the data to. If startInChannel is greater than
    *                       AudioBuffer.length, an INDEX_SIZE_ERR will be thrown.
    */
  def copyToChannel(source: Float32Array, channelNumber: Int, startInChannel: Int = js.native): Unit = js.native

}
