using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace Instacapture.Library.RNInstacaptureLibrary
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNInstacaptureLibraryModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNInstacaptureLibraryModule"/>.
        /// </summary>
        internal RNInstacaptureLibraryModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNInstacaptureLibrary";
            }
        }
    }
}
